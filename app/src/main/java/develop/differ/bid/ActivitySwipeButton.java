package develop.differ.bid;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import develop.differ.bid.swipebutton.SwipeButton;

public class ActivitySwipeButton extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe_button);

        SwipeButton swipeButton = findViewById(R.id.swipeButton);

        // Установка слушателя для изменения состояния
        swipeButton.setOnStateChangeListener(isActive -> {
            if (isActive) {
                Toast.makeText(this, "Button Activated!", Toast.LENGTH_SHORT).show();

            } else {
                Toast.makeText(this, "Button Deactivated!", Toast.LENGTH_SHORT).show();
            }
        });


        // Опционально: Настройка слушателя активации
        swipeButton.setOnActiveListener(() -> {
            Toast.makeText(this, "Swipe action completed!", Toast.LENGTH_SHORT).show();
        });



    }

}
