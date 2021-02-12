import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.*;

import static spark.Spark.get;
import static spark.Spark.staticFileLocation;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");

        List<Project> myProjects= new ArrayList<>();
        myProjects.add(new Project("Covid Stats Tracker","An android app for you to stay up to date on the stats about covid around the world", Arrays.asList("Java", "Android","Firebase"),"covid.png","https://github.com/emile067/covid-tracker4"));
        myProjects.add(new Project("Workout Buddy","An android app that helps you follow along your custom workouts with your desired exercises", Arrays.asList("Java", "Android","Firebase"),"workout.png","https://github.com/emile067/Wokout-Buddy"));

        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("projects",myProjects);
            return new ModelAndView(model, "projects_layout.hbs");
        }, new HandlebarsTemplateEngine());

        get("/about", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "about.hbs");
        }, new HandlebarsTemplateEngine());

        get("/contact", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "contact.hbs");
        }, new HandlebarsTemplateEngine());
    }
}
