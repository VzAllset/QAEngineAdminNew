package org.lightadmin.demo.config;

import org.lightadmin.api.config.AdministrationConfiguration;
import org.lightadmin.api.config.builder.EntityMetadataConfigurationUnitBuilder;
import org.lightadmin.api.config.builder.FieldSetConfigurationUnitBuilder;
import org.lightadmin.api.config.builder.FiltersConfigurationUnitBuilder;
import org.lightadmin.api.config.builder.PersistentFieldSetConfigurationUnitBuilder;
import org.lightadmin.api.config.builder.ScreenContextConfigurationUnitBuilder;
import org.lightadmin.api.config.unit.EntityMetadataConfigurationUnit;
import org.lightadmin.api.config.unit.FieldSetConfigurationUnit;
import org.lightadmin.api.config.unit.FiltersConfigurationUnit;
import org.lightadmin.api.config.unit.ScreenContextConfigurationUnit;
import org.lightadmin.demo.model.QaObject;

public class QaObjectConfiguration extends AdministrationConfiguration<QaObject>
{
	public EntityMetadataConfigurationUnit configuration(EntityMetadataConfigurationUnitBuilder configurationBuilder) {
        return configurationBuilder
                .nameField("name")
                .singularName("QaObject")
                .pluralName("QaObjects").build();
    }

    public ScreenContextConfigurationUnit screenContext(ScreenContextConfigurationUnitBuilder screenContextBuilder) {
        return screenContextBuilder.screenName("Object Administration").build();
    }

    public FieldSetConfigurationUnit listView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
                .field("objId").caption("Object Id")
                .field("objName").caption("Object Name")
                .field("objXpath").caption("Object XPath")
                .field("objDesc").caption("Object Description").build();
    }

    public FieldSetConfigurationUnit quickView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
        		.field("objId").caption("Object Id")
                .field("objName").caption("Object Name")
                .field("objXpath").caption("Object XPath")
                .field("objDesc").caption("Object Description").build();
    }

    public FieldSetConfigurationUnit showView(final FieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
        		.field("objId").caption("Object Id")
                .field("objName").caption("Object Name")
                .field("objXpath").caption("Object XPath")
                .field("objDesc").caption("Object Description").build();
    }

    public FieldSetConfigurationUnit formView(final PersistentFieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
        		.field("objId").caption("Object Id")
                .field("objName").caption("Object Name")
                .field("objXpath").caption("Object XPath")
                .field("objDesc").caption("Object Description").build();
    }

    public FiltersConfigurationUnit filters(final FiltersConfigurationUnitBuilder filterBuilder) {
        return filterBuilder
        		.filter("Object Id","objId")
        		.filter("Object Name","objName")
        		.filter("Object XPath","objXpath")
        		.filter("Object Description","objDesc").build();
    }
}
