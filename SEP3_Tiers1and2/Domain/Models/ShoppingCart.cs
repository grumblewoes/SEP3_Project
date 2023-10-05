namespace Domain.Models;

public class ShoppingCart
{
    public User Owner { get; set; }
    public List<OrderItem> Items { get; set; }
}