package net.codejava;

import java.util.List;
import java.util.ArrayList;
import javax.validation.Valid;

//import org.apache.catalina.realm.UserDatabaseRealm;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.ui.ModelExtensionsKt;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.ui.Model;
//import scala.collection.mutable.StringBuilder;

@Controller
public class MvcController {

    @RequestMapping(method = RequestMethod.GET)
    public String newRegistration(ModelMap model) {
        User user = new User();
        model.addAttribute("user", user);
        return "enroll";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String saveRegistration(@Valid User user, BindingResult result, ModelMap model) {

        if (result.hasErrors()) {
            return "enroll";
        }

        model.addAttribute("success", "Dear " + user.getFullName() + " , your Registration completed successfully");
        return "success";
    }

    @ModelAttribute("clss")
    public List<String> initializeCls() {

        List<String> cls = new ArrayList<String>();
        cls.add("I");
        cls.add("II");
        cls.add("III");
        cls.add("IV");
        cls.add("V");
        cls.add("V1");
        cls.add("V11");
        cls.add("V111");
        cls.add("1X");
        cls.add("X");
        cls.add("X11");
        cls.add("X12");
        return cls;
    }

    @ModelAttribute("division")
    public List<String> initializeDivision() {

        List<String> division = new ArrayList<String>();
        division.add("A");
        division.add("B");
        division.add("C");
        return division;
    } 

    @GetMapping("/user")
    public List<User> getAllUsers(){
    //Returns hardcoded data, a real world application would return from the database
       List<User> userList = new ArrayList<User>();
       userList.add(new User("Mickey",9/71997,"Female","X","A"));
       return userList;
  } 


    // @GetMapping("/App")
    //public String App(@ModelAttribute User user, Model model) {

    //    model.addAttribute("user", user);
    //    return "App";

    //}
    @PostMapping("/User/newuser")
  public void save(){
    //Just has a Sysout stmt, a real world application would save this record to the database
    //System.out.println("Saving person information");
  }
    


}
