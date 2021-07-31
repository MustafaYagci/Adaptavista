package com.Adaptavista.POM;

public class GeneralLocatorPage {

    public class Editor{

        public static final String textIframe_ById= "mce_0_ifr";
        public static final String text_ByXpath="//body[@id='tinymce']";
        public static final String boldOption_ByXpath="//button[@title='Bold']";
    }

    public class Alerts{
        public static final String pageHeader_ByTagName="h3";
    }

    public class Tables{
        public static final String table1Headers_ByXpath="//table[@id='table1']//th";
        public static final String tableData_ByXpath="//table[@id='table1']//td";
        public static final String table1Row_ByXpath="//table[@id='table1']//tr";
        public static final String table1Column_ByXpath="//table[@id='table1']//tr[1]/td";
    }

}
