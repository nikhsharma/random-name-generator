import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.HashMap;

import static spark.Spark.get;

public class NameGeneratorContoller {

    public static void main(String[] args) {
        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();

        NameGenerator.addNameToList("Bob");
        NameGenerator.addNameToList("Sob");
        NameGenerator.addNameToList("Glob");
        NameGenerator.addNameToList("Dob");
        NameGenerator.addNameToList("Fob");
        NameGenerator.addNameToList("Lob");
        NameGenerator.addNameToList("Tob");

        get("/one_random_name", (req, res) -> {
            String name = NameGenerator.oneRandomName();
            HashMap<String, Object> model = new HashMap<>();
            model.put("name", name);
            model.put("template", "one_result.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);

        get("/two_random_names", (req, res) -> {
            ArrayList<String> names = NameGenerator.twoRandomNames();
            HashMap<String, Object> model = new HashMap<>();
            model.put("name1", names.get(0));
            model.put("name2", names.get(1));
            model.put("template", "two_results.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);
    }

}