using ApplicationLogic.LogicInterfaces;
using Domain.DTOs;
using Domain.Models;

namespace ApplicationLogic.Logic;

public class ProductLogic : IProductLogic
{
    public Task<IEnumerable<Product>> GetAsync(SearchProductParamsDto dto)
    {
        //here connects to grpc??
    }
}