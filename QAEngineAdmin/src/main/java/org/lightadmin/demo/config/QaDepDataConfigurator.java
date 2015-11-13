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
import org.lightadmin.demo.model.QaDepData;

public class QaDepDataConfigurator  extends AdministrationConfiguration<QaDepData>
{
	public EntityMetadataConfigurationUnit configuration(EntityMetadataConfigurationUnitBuilder configurationBuilder) {
        return configurationBuilder
                .nameField("name")
                .singularName("QaDepData")
                .pluralName("QaDepData").build();
    }

    public ScreenContextConfigurationUnit screenContext(ScreenContextConfigurationUnitBuilder screenContextBuilder) {
        return screenContextBuilder.screenName("QA Dependent Data Administration").build();
    }

    public FieldSetConfigurationUnit listView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
                .field("id").caption("Id")
                .field("qaFlow").caption("Flow")
                .field("qaStep").caption("Step")
                .field("dataKey").caption("Data key")
                .field("dataValue").caption("Data Value")
                .field("createdDt").caption("Created Date")
                .build();
    }

    public FieldSetConfigurationUnit quickView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
        		.field("id").caption("Id")
                .field("qaFlow").caption("Flow")
                .field("qaStep").caption("Step")
                .field("dataKey").caption("Data key")
                .field("dataValue").caption("Data Value")
                .field("createdDt").caption("Created Date")
                .build();
    }

    public FieldSetConfigurationUnit showView(final FieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
        		.field("id").caption("Id")
                .field("qaFlow").caption("Flow")
                .field("qaStep").caption("Step")
                .field("dataKey").caption("Data key")
                .field("dataValue").caption("Data Value")
                .field("createdDt").caption("Created Date")
                .build();
    }

    public FieldSetConfigurationUnit formView(final PersistentFieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
        		.field("id").caption("Id")
                .field("qaFlow").caption("Flow")
                .field("qaStep").caption("Step")
                .field("dataKey").caption("Data key")
                .field("dataValue").caption("Data Value")
                .field("createdDt").caption("Created Date")
                .build();
    }

    public FiltersConfigurationUnit filters(final FiltersConfigurationUnitBuilder filterBuilder) {
        return filterBuilder
        		.filter("Id","id")
        		.filter("Flow","qaFlow")
        		.filter("Step","qaStep")
        		.filter("Data key","dataKey")
        		.filter("Data Value","dataValue")
        		.filter("Created Date","createdDt")
        		.build();
    }
}
