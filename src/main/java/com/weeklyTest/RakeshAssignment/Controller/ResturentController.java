package com.weeklyTest.RakeshAssignment.Controller;

import com.weeklyTest.RakeshAssignment.Service.Model.Resturent;
import com.weeklyTest.RakeshAssignment.Service.ResturentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ResturentController {
    @Autowired
    ResturentService resturentService;
    @GetMapping("getAllResturent")
    public List<Resturent> getAllResturent(){
        return resturentService.getAllResturentFromService();
    }
    @PostMapping("addResturent")
    public String addResturent(@RequestBody Resturent resturent){
       return  resturentService.addResturentInService(resturent);
    }
    @GetMapping("getSpecificResturent")
    public Resturent getSpecificResturent(@RequestParam String Id){
        return resturentService.getSpecificResturentFromService(Id);
    }
    @PutMapping("updateSpeciality")
    public String updateSpeciality(@RequestParam String Id,@RequestBody Resturent resturent ){
        return resturentService.updateSpecialityInService(Id,resturent.Speciality);
    }
    @DeleteMapping("deleteResturent")
    public String deleteResturent(@RequestParam String Id){
        return resturentService.deleteResturentFromService(Id);
    }
}
