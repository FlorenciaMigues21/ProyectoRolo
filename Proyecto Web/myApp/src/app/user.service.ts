import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from './user';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private baseUrl = "http://localhost:8080/api/"
  constructor(private http: HttpClient) { }

  getUsers(): Observable<User[]>{
    return this.http.get<User[]>("http://localhost:8080/api/user");
  }

  putUser(user: User): void{
    const headers = { 'content-type': 'application/json'}
    const body=JSON.stringify(user);
    console.log(body)
    this.http.post("http://localhost:8080/api/agregar", body,{'headers':headers}).subscribe()
  }
}
