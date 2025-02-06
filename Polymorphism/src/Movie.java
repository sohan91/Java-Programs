public class Movie {
    private  String title;

    public Movie(String title)
    {
        this.title = title;
    }
    public void WatchMovie()
    {
        String instantType = getClass().getSimpleName();
        System.out.println(title+ " is a "+instantType+" Film");
    }
}
 class Adventare extends Movie
{
    public  Adventare(String title)
    {
        super(title);
    }

    @Override
    public void WatchMovie() {
        super.WatchMovie();
        System.out.printf( "...%s\n".repeat(3),"very curious","Totally embeded with Action scene","Goosebum,Back Ground score");
    }
}
class ScinceFiction extends  Movie
{
    public ScinceFiction(String title)
    {
        super(title);
    }
    @Override
    public void WatchMovie()
    {
        super.WatchMovie();
        System.out.printf("...%s\n".repeat(3),"Totally in Science World","Some crazy staff","creates more enthusiasum");
    }
}
class Comedy extends  Movie
{
    public Comedy(String title)
    {
        super(title);
    }
    @Override
    public  void WatchMovie()
    {
        super.WatchMovie();
        System.out.printf("...%s\n".repeat(3),"Starts with Funny elements"," It's gonna be more funnier","End with Happy");
    }
    
}

