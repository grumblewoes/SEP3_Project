namespace Domain.Models;

public class Review
{
    public User Author { get; set; }
    public int Rating { get; set; } //rating out of 5 stars
    public string ReviewText { get; set; }
}