Hibernate: 
    
    create table amazon_delivery_Associate (
       delivery_Associate_No integer not null,
        associate_name varchar(255),
        contact_no varchar(255),
        designation varchar(255),
        experience integer not null,
        primary key (delivery_Associate_No)
    ) engine=InnoDB
Hibernate: 
    
    create table Amazon_Parcel (
       parcel_No integer not null,
        charges double precision not null,
        delivery_type varchar(255),
        description varchar(255),
        weight integer not null,
        delivery_Associate_No integer,
        primary key (parcel_No)
    ) engine=InnoDB
Hibernate: 
    
    create table hibernate_sequence (
       next_val bigint
    ) engine=InnoDB
Hibernate: 
    
    insert into hibernate_sequence values ( 1 )
Hibernate: 
    
    alter table Amazon_Parcel 
       add constraint FKbqu6ys3ebabtyaq7fnihyynth 
       foreign key (delivery_Associate_No) 
       references amazon_delivery_Associate (delivery_Associate_No)

Hibernate: 
    select
        next_val as id_val 
    from
        hibernate_sequence for update
            
Hibernate: 
    update
        hibernate_sequence 
    set
        next_val= ? 
    where
        next_val=?
DeliveryAssociate(deliveryAssociateNo=1, associateName=B89H, experience=6, designation=HYD, contactNo=8888888, parcels=[Parcel(parcelNo=0, description=IPAD, deliveryType=H34D, weight=756, charges=589623.23, deliveryAssociate=null)])
Hibernate: 
    select
        next_val as id_val 
    from
        hibernate_sequence for update
            
Hibernate: 
    update
        hibernate_sequence 
    set
        next_val= ? 
    where
        next_val=?
Hibernate: 
    insert 
    into
        amazon_delivery_Associate
        (associate_name, contact_no, designation, experience, delivery_Associate_No) 
    values
        (?, ?, ?, ?, ?)
Hibernate: 
    insert 
    into
        Amazon_Parcel
        (charges, delivery_Associate_No, delivery_type, description, weight, parcel_No) 
    values
        (?, ?, ?, ?, ?, ?)
Hibernate: 
    update
        Amazon_Parcel 
    set
        delivery_Associate_No=? 
    where
        parcel_No=?