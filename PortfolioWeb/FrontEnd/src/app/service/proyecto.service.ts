import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { proyecto } from '../model/proyecto.model';

@Injectable({
  providedIn: 'root'
})
export class ProyectoService {

  URL = 'http://localhost:8080/proyecto';

  constructor(private http: HttpClient) { }
  public getproyecto(): Observable<proyecto>{
    return this.http.get<proyecto>(this.URL+ 'traer');
  }

}