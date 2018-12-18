import React from 'react';


const ArticleForm = (props) => {

  function handleSubmit(event){
    event.preventDefault();

    const article = {
      "title": event.target.title.value,
      "date": event.target.date.value,
      "category": event.target.category.value,
      "body": event.target.body.value,
      "journalist": event.target.journalist.value
    }
    props.handleArticlePost(article)

  }

  // const journalistOptions = props.journalists.map( (journalist, index) => {
  //   return
  //   <option key={index} value{journalist._links.self.href}>
  //   {journalist.fName}{journalist.lName}
  //   </option>
  // })

  return (
    <div className="add-article">
      <form onSubmit={handleSubmit}>
        <label>Title <input type="text" placeholder="Title" name="title"/></label>
        <input type="Date" placeholder="Date" name="date"/>
        <input type="text" placeholder="Category" name="category"/>
        <input type="textarea" placeholder="Body" name="body"/>
      
        <button type="submit">Save</button>
      </form>

    </div>
  )

}

export default ArticleForm;
