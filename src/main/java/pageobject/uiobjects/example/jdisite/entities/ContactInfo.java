package pageobject.uiobjects.example.jdisite.entities;

import com.epam.jdi.tools.DataClass;

public class ContactInfo extends DataClass<ContactInfo> {
    public String name, lastName, position, description;
    public int passportNumber = -1, passportSeria = -1;
}