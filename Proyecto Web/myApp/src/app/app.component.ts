import {Component, OnInit} from '@angular/core';
import {User} from "./user";
import {UserService} from "./user.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'myApp';

  users: User[] = [];
  constructor(private userService: UserService){}

  ngOnInit(): void {
    this.userService.getUsers().subscribe((data: User[]) => {
      console.log(data);
      this.users = data;
    });
  }

  agregar(): void{
    const nombre = document.getElementById("nombre") as HTMLInputElement;
    const mail = document.getElementById("mail") as HTMLInputElement;
    const comentario = document.getElementById("comentario") as HTMLInputElement;
    if(nombre != null){
      this.userService.putUser(new User(nombre.value,mail.value,comentario.value));
    }
    this.userService.getUsers().subscribe((data: User[]) => {
      console.log(data);
      this.users = data;
    });
    nombre.value= "";
    mail.value= "";
    comentario.value= "";
  }
}
