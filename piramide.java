public static void triangulo(){ //metodo triangulo
String linea=" ";
int cantidad = 10;
int aux = cantidad;
int i ;

for (i = 1; i <= cantidad; i++) {

    for (int j = aux; j>=1; j--){
    linea = linea + " ";
    }
  
    int k = i;
    k = 2*k-1;
  
    for(int j=1; j<=k;j++){
    linea += "*";
    }

  System.out.println(linea);
  linea = " ";
  aux --;
}

} 