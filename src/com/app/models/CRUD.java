package com.app.models;

import java.sql.ResultSet;

public interface CRUD <T> {

  public void create(T objDTO);
  public ResultSet reader();
  public ResultSet reader(T objDTO);
  public void update(T objDTO);
  public void delete(T objDTO);
    
} 