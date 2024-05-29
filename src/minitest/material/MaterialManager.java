package minitest.material;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaterialManager {

    private static List<Material> materialList = new ArrayList<>();

    static {
        materialList.add(new CrispyFlour("1","CrispyFlour1", LocalDate.now(),100,5));
        materialList.add(new CrispyFlour("2","CrispyFlour2", LocalDate.now(),100,5));
        materialList.add(new CrispyFlour("3","CrispyFlour3", LocalDate.now(),100,5));
        materialList.add(new CrispyFlour("4","CrispyFlour4", LocalDate.now(),100,5));
        materialList.add(new CrispyFlour("5","CrispyFlour5", LocalDate.now(),100,5));
        materialList.add(new Meat("6","CrispyFlour5", LocalDate.now(),100,2));
        materialList.add(new Meat("7","CrispyFlour5", LocalDate.now(),100,2));
        materialList.add(new Meat("8","CrispyFlour5", LocalDate.now(),100,2));
        materialList.add(new Meat("9","CrispyFlour5", LocalDate.now(),100,2));
        materialList.add(new Meat("10","CrispyFlour5", LocalDate.now(),100,2));
    }

    public List<Material> getAllMaterial(){
        return materialList;
    }

    public void addNewMaterial(Material m){
        materialList.add(m);
    }




}
