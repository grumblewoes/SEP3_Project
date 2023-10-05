namespace Domain.Models;

public class OrderHistory
{
    public User User { get; set; } //user who owns it
    public List<Order> Orders { get; set; }
}