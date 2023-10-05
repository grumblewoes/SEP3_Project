using ApplicationLogic.LogicInterfaces;
using Microsoft.AspNetCore.Mvc;

namespace WebAPI.Controllers;

[ApiController]
[Route("[controller]")]
public class AdminController : ControllerBase
{
    private readonly IAdminLogic adminLogic;

    public AdminController(IAdminLogic adminLogic)
    {
        this.adminLogic = adminLogic;
    }
}