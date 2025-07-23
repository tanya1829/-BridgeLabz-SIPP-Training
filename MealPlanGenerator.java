package Generics;
// ===== Interface for Meal Plans =====
interface MealPlan {
    void generatePlan();
}

// ===== Concrete Meal Plan Types =====
class VegetarianMeal implements MealPlan {
    @Override
    public void generatePlan() {
        System.out.println("Generated Vegetarian Meal Plan: Paneer Curry, Rice, Salad.");
    }
}

class VeganMeal implements MealPlan {
    @Override
    public void generatePlan() {
        System.out.println("Generated Vegan Meal Plan: Quinoa Bowl, Tofu Stir-fry, Fruit Smoothie.");
    }
}

class KetoMeal implements MealPlan {
    @Override
    public void generatePlan() {
        System.out.println("Generated Keto Meal Plan: Grilled Chicken, Avocado, Boiled Eggs.");
    }
}

class HighProteinMeal implements MealPlan {
    @Override
    public void generatePlan() {
        System.out.println("Generated High Protein Meal Plan: Protein Shake, Boiled Lentils, Grilled Fish.");
    }
}

// ===== Generic Meal Container =====
class Meal<T extends MealPlan> {
    private T meal;

    public Meal(T meal) {
        this.meal = meal;
    }

    public T getMeal() {
        return meal;
    }
}

// ===== Utility Class for Validation and Generation =====
class MealPlanner {
    public static <T extends MealPlan> void validateAndGenerate(Meal<T> meal) {
        if (meal == null || meal.getMeal() == null) {
            System.out.println("Invalid Meal Plan.");
            return;
        }
        System.out.println("Generating personalized meal plan...");
        meal.getMeal().generatePlan();
    }
}

// ===== Main Application Class =====
public class MealPlanGenerator {
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegMeal = new Meal<>(new VegetarianMeal());
        Meal<VeganMeal> veganMeal = new Meal<>(new VeganMeal());
        Meal<KetoMeal> ketoMeal = new Meal<>(new KetoMeal());
        Meal<HighProteinMeal> proteinMeal = new Meal<>(new HighProteinMeal());

        System.out.println("== Personalized Meal Plans ==");
        MealPlanner.validateAndGenerate(vegMeal);
        MealPlanner.validateAndGenerate(veganMeal);
        MealPlanner.validateAndGenerate(ketoMeal);
        MealPlanner.validateAndGenerate(proteinMeal);
    }
}

