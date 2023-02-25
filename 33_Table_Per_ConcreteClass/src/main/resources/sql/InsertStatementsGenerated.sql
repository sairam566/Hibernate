Hibernate: 
    
    create table accidental_insurance_plan (
       insurance_Plan_No integer not null,
        description varchar(255),
        plan_name varchar(255),
        tax_save bit,
        min_insurred_amount float,
        coverage_type varchar(255),
        disability_coverage_percentage float,
        primary key (insurance_Plan_No)
    ) engine=InnoDB
Hibernate: 
    
    create table insurance_plan (
       insurance_Plan_No integer not null,
        description varchar(255),
        plan_name varchar(255),
        tax_save bit,
        min_insurred_amount float,
        primary key (insurance_Plan_No)
    ) engine=InnoDB
Hibernate: 
    
    create table medical_insurance_plan (
       insurance_Plan_No integer not null,
        description varchar(255),
        plan_name varchar(255),
        tax_save bit,
        min_insurred_amount float,
        network_type varchar(255),
        copay integer,
        primary key (insurance_Plan_No)
    ) engine=InnoDB