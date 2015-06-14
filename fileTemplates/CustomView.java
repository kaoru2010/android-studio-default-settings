package ${PACKAGE_NAME};

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by kaoru on 15/06/15.
 */
public class ${NAME} extends View {
    private final float BASE_WIDTH = 640;
    private final float BASE_HEIGHT = 120;
    private float mScaleFactor = 1;

    public ${NAME}(Context context) {
        super(context);
    }

    public ${NAME}(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ${NAME}(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int w = MeasureSpec.getSize(widthMeasureSpec);
        mScaleFactor = w / BASE_WIDTH;

        int h = MeasureSpec.getMode(heightMeasureSpec) == MeasureSpec.EXACTLY
                ? MeasureSpec.getSize(heightMeasureSpec) : (int) (BASE_HEIGHT * mScaleFactor);
        setMeasuredDimension(w, h);
    }
}
