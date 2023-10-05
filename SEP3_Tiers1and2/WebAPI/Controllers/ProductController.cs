using ApplicationLogic.LogicInterfaces;
using Microsoft.AspNetCore.Mvc;

namespace WebAPI.Controllers;

[ApiController]
[Route("[controller]")]
public class ProductController : ControllerBase
{
    private readonly IProductLogic productLogic;

    public ProductController(IProductLogic productLogic)
    {
        this.productLogic = productLogic;
    }
}