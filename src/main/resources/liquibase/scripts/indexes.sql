-- liquibase formatted sql

-- changeset Mat1ro:1
create index idx_name_student on student (name);

-- changeset Mat1ro:2
create index idx_name_and_color_faculty on faculty (name, color);