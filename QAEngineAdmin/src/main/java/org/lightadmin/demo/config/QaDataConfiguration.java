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
import org.lightadmin.demo.model.QaData;

public class QaDataConfiguration extends AdministrationConfiguration<QaData>
{
	public EntityMetadataConfigurationUnit configuration(EntityMetadataConfigurationUnitBuilder configurationBuilder) {
        return configurationBuilder
                .nameField("name")
                .singularName("QaData")
                .pluralName("QaData").build();
    }

    public ScreenContextConfigurationUnit screenContext(ScreenContextConfigurationUnitBuilder screenContextBuilder) {
        return screenContextBuilder.screenName("DATA Administration").build();
    }

    public FieldSetConfigurationUnit listView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
                .field("dataId").caption("Data Id")
                .field("dataName").caption("Data Name")
                .field("dataValue").caption("Data Value")
                .field("dataDescription").caption("Data Description").build();
    }

    public FieldSetConfigurationUnit quickView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
        		.field("dataId").caption("Data Id")
                .field("dataName").caption("Data Name")
                .field("dataValue").caption("Data Value")
                .field("dataDescription").caption("Data Description").build();
    }

    public FieldSetConfigurationUnit showView(final FieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
        		.field("dataId").caption("Data Id")
                .field("dataName").caption("Data Name")
                .field("dataValue").caption("Data Value")
                .field("dataDescription").caption("Data Description").build();
    }

    public FieldSetConfigurationUnit formView(final PersistentFieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
        		.field("dataId").caption("Data Id")
                .field("dataName").caption("Data Name")
                .field("dataValue").caption("Data Value")
                .field("dataDescription").caption("Data Description").build();
    }

    public FiltersConfigurationUnit filters(final FiltersConfigurationUnitBuilder filterBuilder) {
        return filterBuilder
        		.filter("Data Id","dataId")
        		.filter("Data Name","dataName")
        		.filter("Data Valued","dataValue")
        		.filter("Data Description","dataDescription").build();
    }
}
