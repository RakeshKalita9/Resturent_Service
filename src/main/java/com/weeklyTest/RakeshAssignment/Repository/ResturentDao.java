package com.weeklyTest.RakeshAssignment.Repository;

import com.weeklyTest.RakeshAssignment.Service.Model.Resturent;
import com.weeklyTest.RakeshAssignment.Service.ResturentService;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class ResturentDao {
    List<Resturent> resturentList;
    public ResturentDao(){
        resturentList = new ArrayList<>();
    }
    public List<Resturent> getAllResturentFromRepo(){
    return resturentList;
    }
    public Boolean addResturentInRepo(Resturent resturent){
        return resturentList.add(resturent);
    }
    public Resturent getSpecificResturentFromRepo(String Id){
        for(Resturent ele : resturentList){
            String VarId = ele.Id;
            if(Id.equals(VarId)){
                return ele;
            }
        }
        return null;
    }
    public Boolean updateSpecialityInRepo(String Id,String speciality){
        for(Resturent ele : resturentList){
            String VarId =ele.Id;
            if(Id.equals(VarId)){
                ele.Speciality = speciality;
                return  true;
            }
        }
        return false;
    }
    public Boolean deleteResturentFromRepo(String Id){
        for(Resturent ele : resturentList){
            String VarId = ele.Id;
            if(Id.equals(VarId)){
               return  resturentList.remove(ele);
            }
        }
        return false;
    }






}
