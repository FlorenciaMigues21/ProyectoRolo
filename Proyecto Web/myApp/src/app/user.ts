export class User {
  comentario: string;
  mail: string;
  name: string;
  constructor( name: string, mail:string, comentario: string) {
        this.name = name;
        this.mail = mail;
        this.comentario = comentario;
    }

}
