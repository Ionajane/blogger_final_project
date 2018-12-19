import React, { Component } from 'react';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';

import NavBar from './NavBar.js';
import ArticleListContainer from './containers/article/ArticleListContainer.js';
import ArticleFormContainer from './containers/article/ArticleFormContainer.js';
import JournalistListContainer from './containers/journalist/JournalistListContainer.js';
import JournalistFormContainer from './containers/journalist/JournalistFormContainer.js';

class App extends Component {
  render() {
    return (
      <Router >
      <React.Fragment>
      <NavBar />

      <Switch>
      <Route exact path = '/' component={ArticleListContainer}/>
      <Route exact path = '/articles/new' component={ArticleFormContainer}/>
      <Route exact path = '/journalists' component={JournalistListContainer}/>
      <Route exact path = '/journalists/new' component={JournalistFormContainer}/>
      </Switch>
      </React.Fragment>
      </Router>

    );
  }
}

export default App;
