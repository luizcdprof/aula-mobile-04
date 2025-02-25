public class AddTaskActivity extends AppCompatActivity {

    private EditText editTextTask;
    private Button buttonSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);

        editTextTask = findViewById(R.id.editTextTask);
        buttonSave = findViewById(R.id.buttonSave);

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String task = editTextTask.getText().toString();
                Intent resultIntent = new Intent();
                resultIntent.putExtra("task", task);
                setResult(RESULT_OK, resultIntent);
                finish();
            }
        });
    }
}