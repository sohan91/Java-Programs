import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
Consumer<ByteBuffer> operation = (buffer)->{
    byte[] data = new byte[buffer.limit()];
    buffer.get(data);
    System.out.printf("\"%s\" ",new String(data, StandardCharsets.UTF_8));
};
ByteBuffer buffer = ByteBuffer.allocate(1024);
doOperation("Print : ",buffer,(b)->System.out.print(b+" "));
doOperation("Write : ",buffer,b->b.put("This is test ".getBytes()));
    }

    public static  void doOperation(String op, ByteBuffer buffer, Consumer<ByteBuffer> consumer)
    {
        System.out.printf("%-30s",op);
        consumer.accept(buffer);
        System.out.printf("Capacity : %d, Limit : %d, Positioning : %d,Remaning : %d\n",
                buffer.capacity(),
                buffer.limit(),
                buffer.position(),
                buffer.remaining());
    }
}
