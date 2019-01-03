package appdev.org.testcicd;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestJsonObjectController {

    @RequestMapping( value = "/api/jobj", method = RequestMethod.GET)
    public String TestJsonObjectController() {
        JSONObject json_obj = new JSONObject();
            json_obj.put("name", "Jone");
            json_obj.put("age", 17);
        return json_obj.toString();
    }
}