package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    //    private char textContent[] = {F,"GB","ICS","JB","KitKat","L","M"};
    private char text[] = {'c', 'b', 'I', 'J', 'K', 'L', 'M'};

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(Color.WHITE);
        paint.setStrokeWidth(2f);
        canvas.drawLine(100, 100, 100, 700, paint);
        canvas.drawLine(100, 700, 900, 700, paint);
        paint.setTextSize(26);
        canvas.drawText("Froyo", 120, 720, paint);
        canvas.drawText("GB", 240, 720, paint);
        canvas.drawText("ICS", 360, 720, paint);
        canvas.drawText("JB", 480, 720, paint);
        canvas.drawText("KitKat", 560, 720, paint);
        canvas.drawText("L", 700, 720, paint);
        canvas.drawText("M", 800, 720, paint);
        paint.setColor(Color.GREEN);
        float stopY = 700, startY = 700, startX = 120, relayX = 120;
        float stopX = 200, relay2X = 200, relayY = 650, relay2Y = 650;

        for (int i = 0; i < 7; i++) {
            Path p = drawHistogram(startX+110*i, startY, relayX+110*i, relayY-50*i,
                    relay2X+110*i, relay2Y-50*i,
                    stopX+110*i, stopY);
            canvas.drawPath(p, paint);
        }

    }

    //绘制柱体
    private Path drawHistogram(float startX, float startY, float relayX, float relayY,
                               float relay2X, float relay2Y, float stopX, float stopY) {
        Path path = new Path();
        path.moveTo(startX, startY);
        path.lineTo(relayX, relayY);
        path.lineTo(relay2X, relay2Y);
        path.lineTo(stopX, stopY);
        path.close();
        return path;
    }
}
