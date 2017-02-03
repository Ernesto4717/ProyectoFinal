CREATE TABLE user (
username varchar(20) NOT NULL,
  password varchar(20),
  name varchar(100)
);

CREATE TABLE cart (
  cart_id int(11) NOT NULL ,
  amount decimal(10,2) ,
  user_id varchar(20) ,
  create_user varchar(30) ,
  update_date date ,
  create_date date 
);

CREATE TABLE cart_line (
  cart_line_id int(11) NOT NULL ,
  cart_id int(11) NOT NULL,
  item_id int(11) NOT NULL,
  quantity int(11)
);

CREATE TABLE item (
  item_id int(11) NOT NULL,
  description varchar(100) ,
  unit_price decimal(10,2) ,
  stock int(11) 
);
