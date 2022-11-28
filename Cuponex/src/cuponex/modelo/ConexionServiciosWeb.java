package cuponex.modelo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class ConexionServiciosWeb {
    
    
    public static String peticionServicioGET(String url) throws IOException {
        String resultado = "";
        URL urlAcceso = new URL(url);
        HttpURLConnection conexionHTTP = (HttpURLConnection) urlAcceso.openConnection();
        conexionHTTP.setRequestMethod("GET");
        //Realizamos la invocacion del servicio
        int codigoRespuesta = conexionHTTP.getResponseCode();
        System.out.println("Codigo de respuesta obtenido en peticion: "+ codigoRespuesta);
        if(codigoRespuesta == HttpURLConnection.HTTP_OK){
            InputStreamReader isr ;
            isr = new InputStreamReader(conexionHTTP.getInputStream());
            BufferedReader in = new BufferedReader(isr);
            String inputLine;
            StringBuilder response = new StringBuilder();
            while((inputLine = in.readLine()) != null){
                response.append(inputLine);
            }
            in.close();
            resultado = response.toString();
        }else{
            resultado = "Error en la peticion GET con codigo: "+codigoRespuesta;
        }
        return resultado;
    }
    
    public static String peticionServicioPOST(String url, String parametros) throws IOException{
        String resultado = "";
        URL urlAcceso = new URL(url);
        HttpURLConnection conexionHttp = (HttpURLConnection) urlAcceso.openConnection();
        //Diferencia del codigo del GET (Son los que le dan la estructura a la peticion)
        conexionHttp.setRequestMethod("POST");//Solo se le cambia el tipo de peticon que se va a realizar
        conexionHttp.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        conexionHttp.setDoOutput(true);
        //Estos parametros sirven para escribir los datos
        OutputStream  outputSalida = conexionHttp.getOutputStream();
        outputSalida.write(parametros.getBytes());
        outputSalida.flush();
        outputSalida.close();
        
        int codigoRespuesta = conexionHttp.getResponseCode();
        System.out.println("codigo de respuesta");
        if(codigoRespuesta == HttpURLConnection.HTTP_OK){
            //Le el stram de datos y los combierte en una cadena 
            resultado = convierteStreamCadena(conexionHttp.getInputStream());
        }else{
            resultado = "ERROR en la peticion POST con código: "+codigoRespuesta;
        }
        return resultado;
    }
    
    public static String peticionServicioPUT(String url, String parametros) throws IOException{
        String resultado = "";
        URL urlAcceso = new URL(url);
        HttpURLConnection conexionHttp = (HttpURLConnection) urlAcceso.openConnection();
        //Diferencia del codigo del GET (Son los que le dan la estructura a la peticion)
        conexionHttp.setRequestMethod("PUT");//Solo se le cambia el tipo de peticon que se va a realizar
        conexionHttp.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        conexionHttp.setDoOutput(true);
        //Estos parametros sirven para escribir los datos
        OutputStream  outputSalida = conexionHttp.getOutputStream();
        outputSalida.write(parametros.getBytes());
        outputSalida.flush();
        outputSalida.close();
        
        int codigoRespuesta = conexionHttp.getResponseCode();
        System.out.println("codigo de respuesta");
        if(codigoRespuesta == HttpURLConnection.HTTP_OK){
            //Le el stram de datos y los combierte en una cadena 
            resultado = convierteStreamCadena(conexionHttp.getInputStream());
        }else{
            resultado = "ERROR en la peticion PUT con código: "+codigoRespuesta;
        }
        return resultado;
    }
    
    public static String peticionServicioDELETE(String url, String parametros) throws IOException{
        String resultado = "";
        URL urlAcceso = new URL(url);
        HttpURLConnection conexionHttp = (HttpURLConnection) urlAcceso.openConnection();
        //Diferencia del codigo del GET (Son los que le dan la estructura a la peticion)
        conexionHttp.setRequestMethod("DELETE");//Solo se le cambia el tipo de peticon que se va a realizar
        conexionHttp.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        conexionHttp.setDoOutput(true);
        //Estos parametros sirven para escribir los datos
        OutputStream  outputSalida = conexionHttp.getOutputStream();
        outputSalida.write(parametros.getBytes());
        outputSalida.flush();
        outputSalida.close();
        
        int codigoRespuesta = conexionHttp.getResponseCode();
        System.out.println("codigo de respuesta");
        if(codigoRespuesta == HttpURLConnection.HTTP_OK){
            //Le el stram de datos y los combierte en una cadena 
            resultado = convierteStreamCadena(conexionHttp.getInputStream());
        }else{
            resultado = "ERROR en la peticion DELETE con código: "+codigoRespuesta;
        }
        return resultado;
    }
    
    private static String convierteStreamCadena(InputStream streamServicio) throws IOException{
        InputStreamReader isr = new InputStreamReader(streamServicio);
            BufferedReader in = new BufferedReader(isr);
            String inputLine;
            StringBuilder response = new StringBuilder();
            while((inputLine = in.readLine()) != null){
                response.append(inputLine);
            }
            in.close();
            return response.toString();
    }
}
