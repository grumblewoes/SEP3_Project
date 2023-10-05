namespace Domain.Models;

public class Order
{
    public int Id { get; set; }
    public User User { get; set; } //username of the user who made the order
    public string Status { get; set; }
    public List<OrderItem> Items { get; set; }
    
}