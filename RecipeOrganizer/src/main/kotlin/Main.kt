import kotlin.system.exitProcess

data class Recipe(val name: String, val ingredients: String)

data class Category(val name: String, val recipes: MutableList<Recipe> = mutableListOf())

class RecipeManager {
    private val categories: MutableList<Category> = mutableListOf()

    fun addCategory(categoryName: String) {
        val category = Category(categoryName)
        categories.add(category)
        println("Category '$categoryName' added successfully.")
    }

    fun addRecipeToCategory(categoryName: String, recipeName: String, ingredients: String) {
        val category = findCategory(categoryName)
        if (category != null) {
            val recipe = Recipe(recipeName, ingredients)
            category.recipes.add(recipe)
            println("Recipe '$recipeName' added to category '$categoryName'.")
        } else {
            println("Category '$categoryName' not found.")
        }
    }

    fun listRecipesByCategory(categoryName: String) {
        val category = findCategory(categoryName)
        if (category != null) {
            if (category.recipes.isNotEmpty()) {
                println("Recipes in category '$categoryName':")
                category.recipes.forEachIndexed { index, recipe ->
                    println("${index + 1}. ${recipe.name} (${recipe.ingredients})")
                }
            } else {
                println("No recipes found in category '$categoryName'.")
            }
        } else {
            println("Category '$categoryName' not found.")
        }
    }

    fun searchRecipes(query: String) {
        val matchingRecipes = categories.flatMap { it.recipes.filter { recipe -> recipe.name.contains(query, ignoreCase = true) } }

        if (matchingRecipes.isNotEmpty()) {
            println("Matching recipes:")
            matchingRecipes.forEachIndexed { index, recipe ->
                println("${index + 1}. ${recipe.name} (${recipe.ingredients})")
            }
        } else {
            println("No recipes found for '$query'.")
        }
    }

    fun listCategories() {
        if (categories.isNotEmpty()) {
            println("Available Categories:")
            categories.forEachIndexed { index, category ->
                println("${index + 1}. ${category.name}")
            }
        } else {
            println("No categories available.")
        }
    }

    private fun findCategory(categoryName: String): Category? {
        return categories.find { it.name.equals(categoryName, ignoreCase = true) }
    }
}

fun main() {
    val recipeManager = RecipeManager()

    // Sample data
    recipeManager.addCategory("Breakfast")
    recipeManager.addCategory("Lunch")
    recipeManager.addRecipeToCategory("Breakfast", "Omelette", "Eggs, Cheese, Vegetables")
    recipeManager.addRecipeToCategory("Breakfast", "Pancakes", "Flour, Milk, Eggs")
    recipeManager.addRecipeToCategory("Lunch", "Spaghetti", "Ground Beef, Tomato Sauce, Pasta")

    // User interaction
    while (true) {
        println("\nRecipe Manager Menu:")
        println("1. Add Category")
        println("2. Add Recipe")
        println("3. List Recipes by Category")
        println("4. Search Recipes")
        println("5. Exit")
        print("Select an option: ")

        when (readlnOrNull()?.toIntOrNull()) {
            1 -> {
                print("Enter category name: ")
                val categoryName = readlnOrNull() ?: ""
                recipeManager.addCategory(categoryName)
            }
            2 -> {
                print("Enter category name: ")
                val categoryName = readlnOrNull() ?: ""
                print("Enter recipe name: ")
                val recipeName = readlnOrNull() ?: ""
                print("Enter ingredients: ")
                val ingredients = readlnOrNull() ?: ""
                recipeManager.addRecipeToCategory(categoryName, recipeName, ingredients)
            }
            3 -> {
                recipeManager.listCategories()
                print("Select a category: ")
                val selectedCategory = readlnOrNull() ?: ""
                recipeManager.listRecipesByCategory(selectedCategory)
            }
            4 -> {
                print("Enter search query: ")
                val query = readlnOrNull() ?: ""
                recipeManager.searchRecipes(query)
            }
            5 -> {
                println("Exiting Recipe Manager. Goodbye!")
                exitProcess(0)
            }
            else -> println("Invalid option. Please choose a valid option.")
        }
    }
}
