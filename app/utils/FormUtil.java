package utils;

import play.data.DynamicForm;
import play.data.Form;

/**
 * フォームのユーティリティ
 * 
 * @author tako
 *
 */
public class FormUtil {
    public static String getData(String param) {
        DynamicForm input = Form.form();
        input = input.bindFromRequest(param);
        return input.data().get(param);
    }
}
