import { Component } from '@angular/core';

@Component({
  selector: 'my-app',
  template: `<button class="btn btn-primary">hello</button>
            <router-outlet></router-outlet> `,
})
export class AppComponent  { name = 'Angular'; }
