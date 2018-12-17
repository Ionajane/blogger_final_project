import React, { Component } from 'react';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';
//import NavBar and all Containers
import ArticleListContainer from './containers/article/ArticleListContainer.js';

class App extends Component {
  render() {
    return (
      <Router >
      <React.Fragment>
      //NAV BAR
      <Switch>
      <Route exact path = '/articles' component={ArticleListContainer}/>
      </Switch>
      </React.Fragment>
      </Router>

    );
  }
}

export default App;
