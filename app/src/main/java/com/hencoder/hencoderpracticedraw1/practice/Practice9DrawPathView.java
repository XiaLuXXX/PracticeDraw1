package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {

    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        练习内容：使用 canvas.drawPath() 方法画心形
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawPath(drawPath(),paint);
//        paint.setStrokeWidth(5f);
        canvas.drawPoint(400f,400f,paint);
    }

    private Path drawPath(){
        Path path = new Path();
        path.setFillType(Path.FillType.WINDING);

//        path.addCircle(550,400,80, Path.Direction.CCW);
        path.arcTo(400,400,500,500,150,210,true);
        path.arcTo(500,400,600,500,180,200,true);
        path.lineTo(500,600);
        path.lineTo(403,470);
        return path;

    }
}
