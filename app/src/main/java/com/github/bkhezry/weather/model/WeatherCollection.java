package com.github.bkhezry.weather.model;

import android.view.View;

import androidx.annotation.NonNull;

import com.github.bkhezry.weather.R;
import com.github.bkhezry.weather.model.daysweather.ListItem;
import com.github.bkhezry.weather.model.fivedayweather.ListItemHourly;
import com.mikepenz.fastadapter.FastAdapter;
import com.mikepenz.fastadapter.items.AbstractItem;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;

public class WeatherCollection extends AbstractItem<WeatherCollection, WeatherCollection.MyViewHolder> {
  private List<ListItemHourly> listItemHourlies;
  private ListItem listItem;
  private long timestampStart;
  private long timestampEnd;

  public List<ListItemHourly> getListItemHourlies() {
    return listItemHourlies;
  }

  public void setListItemHourlies(List<ListItemHourly> listItemHourlies) {
    this.listItemHourlies = listItemHourlies;
  }

  public void addListItemHourlies(ListItemHourly listItem) {
    if (this.listItemHourlies == null) {
      this.listItemHourlies = new ArrayList<>();
    }
    this.listItemHourlies.add(listItem);
  }

  public ListItem getListItem() {
    return listItem;
  }

  public void setListItem(ListItem listItem) {
    this.listItem = listItem;
  }

  public long getTimestampStart() {
    return timestampStart;
  }

  public void setTimestampStart(long timestampStart) {
    this.timestampStart = timestampStart;
  }

  public long getTimestampEnd() {
    return timestampEnd;
  }

  public void setTimestampEnd(long timestampEnd) {
    this.timestampEnd = timestampEnd;
  }


  @NonNull
  @Override
  public MyViewHolder getViewHolder(@NonNull View v) {
    return new MyViewHolder(v);
  }

  @Override
  public int getType() {
    return R.id.fastadapter_item_adapter;
  }

  @Override
  public int getLayoutRes() {
    return R.layout.weather_day_item;
  }

  protected static class MyViewHolder extends FastAdapter.ViewHolder<WeatherCollection> {
    View view;


    MyViewHolder(View view) {
      super(view);
      ButterKnife.bind(this, view);
      this.view = view;
    }

    @Override
    public void bindView(@NonNull WeatherCollection item, @NonNull List<Object> payloads) {

    }

    @Override
    public void unbindView(@NonNull WeatherCollection item) {

    }

  }
}