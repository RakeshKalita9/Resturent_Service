package com.weeklyTest.RakeshAssignment.Service;

import com.weeklyTest.RakeshAssignment.Repository.ResturentDao;
import com.weeklyTest.RakeshAssignment.Service.Model.Resturent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ResturentService {
    @Autowired
    ResturentDao resturentDao;
    public List<Resturent> getAllResturentFromService(){
        return resturentDao.getAllResturentFromRepo();
    }
   public String addResturentInService(Resturent resturent){
        return "Status for adding NewResturent is "+resturentDao.addResturentInRepo(resturent);
   }
   public Resturent getSpecificResturentFromService(String Id){
        return resturentDao.getSpecificResturentFromRepo(Id);
   }
   public String updateSpecialityInService(String Id, String speciality){
        return "Status For Updating Speciality is "+resturentDao.updateSpecialityInRepo(Id,speciality);
   }
   public String deleteResturentFromService(String Id){
        return "Status For Resturent Deletion is "+resturentDao.deleteResturentFromRepo(Id);
   }
}
