using Domain.DTOs;
using Domain.Models;

namespace ApplicationLogic.LogicInterfaces;

public interface IProductLogic
{
    Task<IEnumerable<Product>> GetAsync(SearchProductParamsDto dto);
}