namespace Domain.DTOs;

public class SearchProductParamsDto
{
    public string? titleContains { get; }

    public SearchProductParamsDto(string? titleContains)
    {
        this.titleContains = titleContains;
    }
}