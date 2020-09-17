package com.example.crud_sqlite;

import android.os.Bundle;

import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.KeyEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView; import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private EditText et_codigo, et_descripcion, et_precio;
    private Button btn_guardar, btn_consultar1, btn_consultar2, btn_eliminar, btn_actualizar;
    private TextView tv_resultado;

    boolean inputEt=false;
    boolean inputEd=false;
    boolean input1=false;
    int resultadolnsert=0;

    Modal ventanas = new Modal();
    ConexionSQLite conexion = new ConexionSQLite(this);
    Dto datos = new Dto();
    AlertDialog.Builder dialogo;


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            new android.app.AlertDialog.Builder(this)
                    .setIcon(R.drawable.ic_close)
                    .setTitle("Warning")
                    .setMessage("¿Realmente desea salir?")
                    .setNegativeButton(android.R.string.cancel, null)
                    .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {//un listener que at pulsar, cierre la aplicacion
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
        /*lntent intent —— new Intent(DashboardLuces.this, luces control sms.class), startActivity(intent),’”/
        //MainActivity.this.finishAffinity(),
        //finish()*/
                            finishAffinity();
                        }
                    }).show();
            // Si el listener devuelve true, significa que el evento esta procesado, y nadie debe hacer nada mas
            return true;
        }
        //para las demas cosas, se reenvia el evento at listener habitual
        return super.onKeyDown(keyCode, event);
    }

        @Override
        protected void onCreate(Bundle savedlnstancestate) {
        super.onCreate(savedlnstancestate);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.ic_black));
        toolbar.setTitleTextColor(getResources().getColor(R.color.mycolor1)), toolbar.setTitIeMargin(0, 0, 0, 0);
        toolbar.setSubtitIe("CRUD SQLite-2019"); toolbar.setSubtitIeTextCoIor(getResources().getCoIor(R.color.mycolor)), toolbar.setTitIe("Prof. Gâmez");
        setSupportActionBar(toolbar);

        //y esto para panda/la completa (oculta incluso la barra de estado)
        getWindow().setFIags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        toolbar.setNavigationOnCIickListener(new View.OnCIickListener() { @Override



        )):

        public void onCIick(View view) { confirmacion();


        FloatingActionButton fab = findViewById(R.id.fab), fab.setOnCIickListener(new View.OnCIickListener() {
        @Override
        public void onCIick(View view) {
        // Snackbar.make(view, ”Replace with your own action”, Snackbar. LENGTH LONG)
        //	. setAction(”Action”, null). show(),
        ventanas.Search(MainActivity.this);

        )):
        et_codigo = (EditText) findViewByld(R.id.et_codigo), et_descripcion = (EditText) findViewByld(R.id.et_descripcion),' et_precio = (EditText) findViewByld(R.id.et_precio); btn_guardar = (Button) findViewByld(R.id.btn_guardar), btn_consultar1 = (Button) findViewByld(R.id.btn_consultar1); btn_consultar2 = (Button) findViewByld(R.id.6tn_consultar2),' btn_eliminar = (Button) findViewByld(R.id.btn_eliminar), btn_actualizar = (Button) findViewByld(R.id.btn_actualizar),
        //tv resultado —— (TextView) findViewByld(R.id.tv resultado),’

        String senal = ""; String codigo = ""; String descripcion = ""; String precio = "";


        Intent intent = getlntent();
        Bundle bundle = intent.getExtras(); if (bundle != null) {
        codigo = bundle.getString("codigo"); senal = bundle.getString("senal");
        descripcion = bundle.getString("descripcion"); precio = bundle.getString("precio");
        if (senal.equals("1")) ( et_codigo.setText(codigo); et_descripcion.setText(descripcion); et_precio.setText(precio);
        //finish(),


        }catch (Exception e){





        private void confirmacion(){
        String mensaje = "¿Realmente desea salir?"; dialogo = new AlertDialog.Builder(MainActivity.this); dialogo.setIcon(R.drawabIe.ic_c/ose); dialogo.setTitIe("Warning"); dialogo.setMessage(mensaje); dialogo.setCanceIabIe(false);
        dialogo.setPositiveButton("Aceptar", new DiaIogInterface.OnCIickListener() {
        public void onCIick(DiaIogInterface dialogo, int id) {
        /*lntent intent —— new Intent(DashboardLuces.this, luces control sms. class), startActivity(intent),”/
        //DashboardLuces.this. finishAffinity(),
        MainActivity.this.finish();

        )):
        dialogo.setNegativeButton("Cancelar", new DiaIogInterface.OnCIickListener() {
        public void onCIick(DiaIogInterface dialogo, int id) {
        //Toast. makeText(getApplicationContext(), "Operacion Cancelada.", Toast. LENGTH LONG). show(),’

        )):
        dialogo.show();



        @Override
        public boolean onCreateOptionsMenu(Menu menu) (
        // Inflate the menu,’ this adds items to the action bar if it is present.
        getMenulnflater().inflate(R.menu.menu_main, menu); return true;


        @Override
        public boolean onOptionsItemSeIected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest. xml.
        int id = item.getItemId();

        //noinspection SimplifiablelfStatement
        if (id == R.id.acfion_/impiar)

        et_codigo.setText(null); et_descripcion.setText(null); et_precio.setText(null); return true;
        }else if(id == R.id.action_listaArticulos){
        Intent spinnerActivity = new Intent(MainActivity.this, ConsuItaSpinner.class); startActivity(spinnerActivity);
        return true;
        }else if(id == R.id.action_listaArticulos1){
        Intent IistViewActivity = new Intent(MainActivity.this, ListViewArticuIos.class); startActivity(IistViewActivity);
        return true;


        return super.onOptionsItemSeIected(item);



        public void aIta(View v) { if(et_codigo.getText().toString().length()==0)(
        et_codigo.setError("Campo obligatorio”); inputEt = false;
        }else {
        inputEt=true;

        if(et_descripcion.getText().toString().length()==0){ et_descripcion.setError("Campo obligatorio"); inputEd = false;
        }else {
        inputEd=true;

        if(et_precio.getText().toString().length()==0){ et_precio.setError("Campo obligatorio"); input1 = false;
        }else {
        input1=true;

        if (inputEt && inputEd && input1){


        datos.setCodigo(Integer.parseln/(et_codigo.getText().tostring())); datos.setDescripcion(et_descripcion.getText().tostring()); datos.setPrecio(Double.paseDoob/e(et_precio.getText().tostring()));
        //if(conexion.insertardatos(datos))(
        //if(conexion.InsertRegister(datos)){
        if(conexion.InserTradicionaI(datos)){

        Toast.make text(this, "Registro agregado satisfactoriamente!", Toast.LENGTH_SHORTj.show(),
        IimpiarDatos();
        }else{
        Toast.make text(getAppIicationContext(), "Error. Ya existe un registro\n" +
        " Cédigo: "+et_codigo.getText().toString(),Toast.LENGTH_LONG).show(); IimpiarDatos();


        }catch (Exception e){
        Toast.makeTex/(this, "ERROR. Ya existe.", Toast.LENGTH_SHOR	.show();



        public void mensaje (String mensaje){
        Toast.make text(this, ""+mensaje, Toast.LENGTH_SHORTj.show();


        public void IimpiarDatos(){ et_codigo.setText(null); et_descripcion.setText(null); et_precio.setText(null); et_codigo.requestFocus();


        public void consuItaporcodigo(View v) { if(et_codigo.getText().toString().length()==0)(
        et_codigo.setError("Campo obligatorio”); inputEt = false;
        }else {
        inputEt=true;

        if(inputEt){
        String codigo = et_codigo.getText().tostring(); datos.setCodigo(Integer.parselnt(codigo));
        //if(conexion.consultaCodigo(datos)){
        if(conexion.consuItaArticuIos(datos))( et_descripcion.setText(datos.getDescripcion()); et_precio.setText(""+datos.getPrecio());
        //Toast. makeText(this, "Se encontro uno", Toast. LENGTH SHORT). show(),
        }else{
        Toast.make text(this, "No existe un articulo con dicho cédigo", Toast.LENGTH_SHOR	.show(),
        IimpiarDatos();

        }else{
        Toast.make text(this, "Ingrese el cédigo del articulo a buscar.", Toast.LENGTH_SHORTj.show(),



        public void consuItapordescripcion(View v) ( if(et_descripcion.getText().toString().length()==0){
        et_descripcion.setError("Campo obligatorio"); inputEd = false;
        }else {
        inputEd=true; if(inputEd){
        String descripcion = et_descripcion.getText().tostring(); datos.setDescripcion(descripcion); if(conexion.consuItarDescripcion(datos)){
        et_codigo.setText(""+datos.getCodigo()); et_descripcion.setText(datos.getDescripcion()); et_precio.setText(""+datos.getPrecio());
        //Toast. makeText(this, "Se encontro uno", Toast. LENGTH SHORT). show(),
        }else{
        Toast.make text(this, "No existe un articulo con dicha descripcién", Toast.LENGTH_SHOR	.show(),
        IimpiarDatos();


        }else{
        Toast.make text(this, "Ingrese la descripcién del articulo a buscar.", Toast.LENGTH_SHORTj.show(),



        public void bajaporcodigo(View v) { if(et_codigo.getText().toString().length()==0)(
        et_codigo.setError("campo obligatorio"); inputEt = false;
        }else {
        inputEt=true;

        if(inputEt){
        String cod = et_codigo.getText().tostring(); datos.setCodigo(Integer.parselnt(cod)); if(conexion.bajaCodigo(MainActivity.this,datos)){
        //Toast. makeText(this, "Registro eliminado satisfactoriamente.", Toast. LENG TH SHORT). show(),
        IimpiarDatos();
        }else{
        Toast.makeTex/(this, "No existe un articulo con dicho cédigo.", Toast.LENGTH_SHORTj.show(),
        IimpiarDatos();



        public void modificacion(View v) { if(et_codigo.getText().toString().length()==0)(
        et_codigo.setError("campo obligatorio"); inputEt = false;
        }else {
        inputEt=true;


        if(inputEt) {

        String cod = et_codigo.getText().tostring();
        String descripcion = et_descripcion.getText().tostring();
        double precio = Double.paseDoud/e(et_precio.getText().tostring());

        datos.setCodigo(Integer.parse/at(cod)); datos.setDescripcion(descripcion); datos.setPrecio(precio); if(conexion.modificar(datos)){
        Toast.make text(this, "Registro Modificado Correctamente.", Toast.LENGTH_SHOR	.show(),
        }else{
        Toast.makeTex/(this, "No se han encontrado resultados para la busqueda especificada.", Toast.LENGTH_SHORTj.show();

        }