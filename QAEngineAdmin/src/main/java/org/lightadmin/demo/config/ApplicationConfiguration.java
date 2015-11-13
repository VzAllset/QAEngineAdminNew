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
import org.lightadmin.demo.model.Application;

public class ApplicationConfiguration extends AdministrationConfiguration<Application>
{
	 public EntityMetadataConfigurationUnit configuration(EntityMetadataConfigurationUnitBuilder configurationBuilder) {
	        return configurationBuilder
	                .nameField("name")
	                .singularName("Application")
	                .pluralName("Applications").build();
	    }

	    public ScreenContextConfigurationUnit screenContext(ScreenContextConfigurationUnitBuilder screenContextBuilder) {
	        return screenContextBuilder.screenName("Application Administration").build();
	    }

	    public FieldSetConfigurationUnit listView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
	        return fragmentBuilder
	                .field("applicationId").caption("Application Id")
	                .field("applicationName").caption("Application Name")
	                .field("applicationUrl").caption("Application URL").build();
	    }

	    public FieldSetConfigurationUnit quickView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
	        return fragmentBuilder
	        		.field("applicationId").caption("Application Id")
	                .field("applicationName").caption("Application Name")
	                .field("applicationUrl").caption("Application URL").build();
	    }

	    public FieldSetConfigurationUnit showView(final FieldSetConfigurationUnitBuilder fragmentBuilder) {
	        return fragmentBuilder
	        		.field("applicationId").caption("Application Id")
	                .field("applicationName").caption("Application Name")
	                .field("applicationUrl").caption("Application URL").build();
	    }

	    public FieldSetConfigurationUnit formView(final PersistentFieldSetConfigurationUnitBuilder fragmentBuilder) {
	        return fragmentBuilder
	        		.field("applicationId").caption("Application Id")
	                .field("applicationName").caption("Application Name")
	                .field("applicationUrl").caption("Application URL").build();
	    }

	    public FiltersConfigurationUnit filters(final FiltersConfigurationUnitBuilder filterBuilder) {
	        return filterBuilder
	                .filter("Application Id", "applicationId").build();
	    }
}
