package com.example.sonymobile.smartextension.clockwidget.widgets;

/**
 * Created by Dawid on 2015-09-09.
 */
import com.example.sonymobile.smartextension.clockwidget.R;
import com.sonyericsson.extras.liveware.extension.util.widget.BaseWidget;

/**
 * Created by Dawid on 2015-09-09.
 */
public class Triangle extends SmartWatch2ClockWidget {
    public Triangle(BaseWidget.WidgetBundle widgetBundle) {
        super(widgetBundle);
    }

    @Override
    public int getWidth() {
        return getCellWidth() * 5;
    }

    @Override
    public int getHeight() {
        return getCellHeight() * 5;
    }

    @Override
    int getWidgetLayout() {
        return R.layout.triangle;
    }

    @Override
    public int getName() {
        return R.string.clock_widget_analog_levellist_name;
    }

    @Override
    public int getPreviewUri() {
        return R.drawable.triangle_preview;
    }
}