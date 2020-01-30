package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.generalmobile.app.driverexample.DataBinderMapperImpl());
  }
}
