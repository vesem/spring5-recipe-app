package guru.springframework.controllers;

import guru.springframework.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class IngredientController {

    private final RecipeService recipeService;

    public IngredientController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping("/recipe/{recipeId}/ingredients")
    public String ingredients(@PathVariable String recipeId, Model model) {
        log.debug("Getting ingredient list for recipe id " + recipeId);

        model.addAttribute("recipe", recipeService.findByCommandId(Long.valueOf(recipeId)));

        return "recipe/ingredient/list";
    }
}
