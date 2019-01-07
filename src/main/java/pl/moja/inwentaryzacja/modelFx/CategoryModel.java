package pl.moja.inwentaryzacja.modelFx;

import pl.moja.inwentaryzacja.database.dao.CategoryDao;
import pl.moja.inwentaryzacja.database.dbUtilities.DbManager;
import sun.util.resources.cldr.pt.CalendarData_pt_AO;

public class CategoryModel {

    public  void saveCategoryInDataBase (String name){
        CategoryDao categoryDao = new CategoryDao(DbManager.getConnectionSource());


    }
}
