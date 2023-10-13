using ApplicationLogic.LogicInterfaces;
using Domain.DTOs;
using Domain.Models;
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

    [HttpGet]
    public async Task<ActionResult<IEnumerable<Product>>> GetAsync([FromQuery] string? titleContains)
    {
        try
        {
            SearchProductParamsDto parameters = new(titleContains);
            var products = await productLogic.GetAsync(parameters);
            return Ok(products);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    
}