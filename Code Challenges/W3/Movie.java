import java.util.Scanner;

class Movie 
{
    private String name;
    private double duration;
    private String company;

    public Movie()
    {
        this.name = "Unknown Movie";
        this.duration = 0.0;
        this.company = "Unknown Company";
    }

    public Movie(String movieName, double movieDuration, String prodCompanyName)
    {
        this.name = movieName;
        this.duration = movieDuration;
        this.company = prodCompanyName;
    }

    public void display()
    {
        System.out.println("A new movie has been added: " + name);
        System.out.println("Runs for " + duration + " and is produced by " + company);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the Movie: ");
        String newMovieName = scanner.nextLine();
        System.out.println("Enter the duration of the Movie: ");
        double newMovieDuration = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the production company of the Movie: ");
        String newMovieCompany = scanner.nextLine();

        Movie myMovie = new Movie(newMovieName, newMovieDuration, newMovieCompany);
        myMovie.display();

    }
}